object RLEngineItems {
    private val RLEItems = mutableMapOf<String, AbstractRLItem>()
    private val registryElements = listOf(
        GliderItem,
    )
    init{
        registryElements.forEach { it.createItem() }
    }

    fun registerItem(id:String, item: AbstractRLItem){
        RLEItems[id] = item
        GliderMod.instance.logger.info("Registered item: $id")
    }
}