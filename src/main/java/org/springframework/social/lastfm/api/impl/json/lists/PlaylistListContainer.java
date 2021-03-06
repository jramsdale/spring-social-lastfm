/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.lastfm.api.impl.json.lists;

import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.social.lastfm.api.Image;
import org.springframework.social.lastfm.api.LastFmProfile;
import org.springframework.social.lastfm.api.Playlist;

/**
 * @author Michael Lavelle
 */
@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Container for a list of Last.fm users- allows for automatic JSON binding from *either* a list of objects
 * or a Map representation of a single playlist, as LastFm responds with different Json structures
 * depending on whether a single playlist is returned or a number of playlists
 * 
 * @author Michael Lavelle
 */
public class PlaylistListContainer extends AbstractLastFmListContainer<Playlist> {


	@JsonCreator
	public PlaylistListContainer(List<Playlist> playlists) {
		super(playlists);
	}
	
	@JsonCreator
	public PlaylistListContainer(String id,String title,String description) {
		super(new Playlist(id,title,description));
	}
	

	public List<Playlist> getPlaylists() {
		return elements;
	}

}
