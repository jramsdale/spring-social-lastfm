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

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.social.lastfm.api.Shout;

/**
 * @author Michael Lavelle
 */
@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Container for a shout list - allows for automatic JSON binding from *either* a list of Shouts
 * or a Map representation of a single shout, as LastFm responds with different Json structures
 * depending on whether a single shout is returned
 * 
 * @author Michael Lavelle
 */
public class ShoutListContainer extends AbstractLastFmListContainer<Shout> {


	@JsonCreator
	public ShoutListContainer(List<Shout> shouts) {
		super(shouts);
	}
	
	public ShoutListContainer(String message, Date date,String author) {
		super(new Shout(message,date,author));
	}

	public List<Shout> getShouts() {
		return elements;
	}

}
