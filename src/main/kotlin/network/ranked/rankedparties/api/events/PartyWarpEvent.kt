package network.ranked.rankedparties.api.events

import org.bukkit.event.Cancellable
import java.util.*

class PartyWarpEvent(
    private val uuid: UUID,
    private val name: String,
    private val server: String
) : PartyEvent(), Cancellable {

    private var cancelled = false

    fun getUUID() : UUID {
        return uuid
    }

    fun getName() : String {
        return name
    }

    fun getServer() : String {
        return server;
    }

    override fun isCancelled(): Boolean {
        return cancelled;
    }

    override fun setCancelled(cancelled: Boolean) {
        this.cancelled = cancelled;
    }
}