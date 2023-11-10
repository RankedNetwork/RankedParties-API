package network.ranked.rankedparties.api

object PartiesProvider {

    private var api: PartiesAPI? = null

    @JvmStatic
    fun setApi(api: PartiesAPI) {
        this.api = api
    }

    @JvmStatic
    fun getApi() : PartiesAPI {
        return if (api == null) {
            throw IllegalStateException("PartiesAPI has not been set yet!")
        } else {
            api!!
        }
    }



}