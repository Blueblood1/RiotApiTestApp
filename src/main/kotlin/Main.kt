import no.stelar7.api.r4j.basic.APICredentials
import no.stelar7.api.r4j.basic.constants.api.regions.LeagueShard
import no.stelar7.api.r4j.basic.constants.api.regions.RegionShard
import no.stelar7.api.r4j.impl.R4J

val riotApi = R4J(APICredentials(
    "RGAPI-02d08ef5-c303-4be2-b3c0-3cf3fd99cb09",
    "NO_KEY_:(",
    "NO_KEY_:(",
    "NO_KEY_:(",
    "NO_KEY_:("
))

fun main(args: Array<String>) {



    val summoner = with(riotApi.loLAPI.summonerAPI) {
        getSummonerByName(LeagueShard.EUW1, "PickVayneWinGame")
    }

    val matchIterator = riotApi.loLAPI.matchAPI.getMatchIterator(RegionShard.EUROPE, summoner.puuid)
    val match = riotApi.loLAPI.matchAPI.getMatch(RegionShard.EUROPE, "EUW1_6061794211")

    match.timeline.frames[0].events[0].
    // EUW1_6061794211
//    val matches = riotApi.loLAPI.matchAPI.getMatchList(
//        RegionShard.EUROPE,
//        summoner.puuid,
//        GameQueueType.ARAM,
//        MatchlistMatchType.NORMAL,
//        0,
//        1,
//        LocalDateTime.now().minus(Duration.ofDays(31)).toEpochSecond(ZoneOffset.UTC),
//        LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)
//    )

    TODO()
}

