package syntax.properties.top_level_property.example2

import java.lang.StringBuilder

val String.lastChar: Char
    get() = get(length - 1)

/**
 * Определяя то же самое свойство для класса StringBuilder, его можно
 * объявить как var, потому что содержимое экземпляра StringBuilder может меняться.
 */
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }
