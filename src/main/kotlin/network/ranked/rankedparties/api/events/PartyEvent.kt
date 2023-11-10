package network.ranked.rankedparties.api.events

import org.bukkit.Bukkit
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

abstract class PartyEvent : Event() {

    companion object {
        private val handlers = HandlerList()

        @JvmStatic
        fun getHandlerList() : HandlerList {
            return handlers
        }

    }

    override fun getHandlers(): HandlerList {
        return handlers
    }

    fun call() {
        Bukkit.getPluginManager().callEvent(this)
    }

}