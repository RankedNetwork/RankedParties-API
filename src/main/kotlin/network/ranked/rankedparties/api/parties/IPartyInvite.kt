package network.ranked.rankedparties.api.parties

import java.util.*

/**
 * Represents a party
 * Understand that any method here should NEVER BE USED
 * BY YOUR PLUGIN
 */
interface IPartyInvite {

   fun getParty() : IParty?

   fun getInviter() : UUID

   fun getInvited() : UUID

   fun accept(name: String) : Boolean

   fun timeout()

   fun cancelTask()

}