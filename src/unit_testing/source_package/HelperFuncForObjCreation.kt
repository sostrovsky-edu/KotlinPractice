package unit_testing.source_package

import java.time.Instant

class HelperFuncForObjCreation {
/*    // #1
    val testDesign = Design(
            id = 1,
            userId = 9,
            name = "Fox",
            dateCreated = Instant.now(),
            tags = mapOf()
    )
    val testDesign2 = Design(
            id = 2,
            userId = 9,
            name = "Cat",
            dateCreated = Instant.now(),
            tags = mapOf()
    )

    // #2
    fun createDesign(
            id: Int = 1,
            name: String = "Cat",
            date: Instant = Instant.ofEpochSecond(1518278198),
            tags: Map<Locale, List<Tag>> = mapOf(
                    Locale.US to listOf(Tag(value = "$name in English"))
            )
    ) = Design(
            id = id,
            userId = 9,
            name = name,
            dateCreated = date,
            tags = tags
    )

    // Usage
    val testDesign = createDesign()
    val testDesign2 = createDesign(
            id = 1,
            name = "Fox"
    )
    // Tailored creation function for current test
    repo.saveAll(
        createDesign(isEnabled = true, language = Locale.US),
        createDesign(isEnabled = true, language = Locale.GERMANY),
        createDesign(isEnabled = false, language = Locale("nk", "NL"))
    )

    fun createDesign(
        isEnabled: Boolean,
        language: Locale
    ) = createDesign(
            description = createDescription(
                    translations = createTranslationsFor(language)
            ),
            state = if (isEnabled) createDisabledState() else createEnabledState()
    )*/
}