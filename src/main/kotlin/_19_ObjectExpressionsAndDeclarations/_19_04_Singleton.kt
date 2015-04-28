package _19_ObjectExpressionsAndDeclarations


object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {
        // ...
    }

    val allDataProviders : Collection<DataProvider>
        get() = listOf(DataProvider())
}

data class DataProvider

fun testSingleton() {
    DataProviderManager.registerDataProvider(DataProvider())
}

