package syntax.functions.type.regular_func.example1

import data.type.classes.type.enum_class.example1.MaritalStatusEnum

fun getMaritalStatus(args: Array<String>): MaritalStatusEnum? =
        if (args.size > 2) {
            when (args[2]) {
                "Married" -> MaritalStatusEnum.Married
                "NotMarried" -> MaritalStatusEnum.NotMarried
                else -> MaritalStatusEnum.Unknown
            }
        } else null
