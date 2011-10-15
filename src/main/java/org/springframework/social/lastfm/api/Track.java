package org.springframework.social.lastfm.api;

/**
 * @author Michael Lavelle
 */
public class Track implements TrackDescriptor {

	private String url;
	private String name;
	private String musicBrainsId;
	private Artist artist;

	public String getMusicBrainsId() {
		return musicBrainsId;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public void setMusicBrainsId(String musicBrainsId) {
		this.musicBrainsId = musicBrainsId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Track(String url, String name,String musicBrainsId,Artist artist) {
		this.url = url;
		this.name = name;
		this.musicBrainsId = musicBrainsId;
		this.artist = artist;
	}

	@Override
	public String getArtistName() {
		return artist.getName();
	}

}
