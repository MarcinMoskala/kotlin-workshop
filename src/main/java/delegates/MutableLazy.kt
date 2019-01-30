package delegates

import org.junit.Test
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import kotlin.system.measureTimeMillis

fun <T> mutableLazy(initializer: () -> T): ReadWriteProperty<Any?, T> = MutableLazy(initializer)

private class MutableLazy<T>(val initializer: () -> T) : ReadWriteProperty<Any?, T> {
    var internalValue: Any? = NotSetPointer

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if (internalValue == NotSetPointer) {
            internalValue = initializer()
        }
        return internalValue as T
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        internalValue = value
    }
}

private object NotSetPointer

@Suppress("FunctionName")
class MutableLazyTests {

    @Test
    fun `I don't have to wait if I changed value first`() {
        val time = measureTimeMillis {
            var game: Game? by mutableLazy { readGameFromSave() }
            game = Game()
            print(game)
        }
        assert(time in 0..100)
    }

    @Test
    fun `I have to wait if I changed value first`() {
        val time = measureTimeMillis {
            val game: Game? by mutableLazy { readGameFromSave() }
            print(game)
        }
        assert(time in 450..550)
    }

    private class Game()

    private fun readGameFromSave(): Game? {
        Thread.sleep(500)
        return Game()
    }
}
