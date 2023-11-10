package network.ranked.rankedparties.api.parties

import java.util.*
import java.util.concurrent.CompletableFuture

/**
 * Represents a party
 * Understand that any method here should NEVER BE USED
 * BY YOUR PLUGIN
 */
interface IParty {

    /**
     * Get the leader of the party
     */
    fun getLeader() : UUID

    /**
     * Check if the given UUID is the leader of the party
     * @param uuid The UUID to check
     * @return True if the given UUID is the leader of the party
     */
    fun isLeader(uuid: UUID) : Boolean

    /**
     * Check if the party has a given member
     * @param uuid The UUID of the member to check
     */
    fun hasMember(uuid: UUID) : Boolean

    /**
     * Get a list of all members in the party
     * @return A list of all members in the party
     */
    fun getMembers() : List<UUID>

    /**
     * Checks if a given member is offline
     * @param uuid The UUID of the member to check
     * @return A completable future that will complete with true if the member is offline
     */
    fun isMemberOffline(uuid: UUID) : CompletableFuture<Boolean>

    /**
     * Check if the party is private
     * @return True if the party is private
     */
    fun isPrivate() : Boolean

    fun getInvites() : List<IPartyInvite>

    fun getInviteByInviterAndInvited(inviter: UUID, invited: UUID) : Optional<IPartyInvite>

    fun getInviteByInvited(invited: UUID) : Optional<IPartyInvite>

}