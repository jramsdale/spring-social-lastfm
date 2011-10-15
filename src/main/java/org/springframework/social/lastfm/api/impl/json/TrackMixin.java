package org.springframework.social.lastfm.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.lastfm.api.Artist;
import org.springframework.social.lastfm.api.SimpleArtist;

/**
 * Annotated mixin to add Jackson annotations to Track.
 * 
 * @author Michael Lavelle
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TrackMixin {

	@JsonCreator
	TrackMixin(@JsonProperty("url") String url,
			@JsonProperty("name") String name,@JsonProperty("mbid") String musicBrainsId,@JsonProperty("artist") Artist artist) {
	}

}
