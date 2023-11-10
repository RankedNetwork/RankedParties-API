package network.ranked.rankedparties.api

import network.ranked.rankedparties.api.parties.IParty
import java.util.*

interface PartiesAPI {

    fun getPartyByLeader(leader: UUID) : Optional<IParty>

    fun getPartyByMember(member: UUID) : Optional<IParty>

    fun isInParty(player: UUID) : Boolean

}