package syntax.functions.type.regular_func.example1

import data.type.classes.type.enum_class.example1.SexEnum

fun guessSex(args: Array<String>): SexEnum? =
        if (args.size > 3) {
                when (args[3]) {
                        "Male" -> SexEnum.Male
                        "Female" -> SexEnum.Female
                        else -> SexEnum.NonBinary
                }
        } else null