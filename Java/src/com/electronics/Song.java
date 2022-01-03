package com.electronics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Song implements Comparable<Song>{
private String name;
private String artist;
private String songType;
private Date dateDownloaded;
private double Rating;
private int numberOfDownloads;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getSongType() {
	return songType;
}
public void setSongType(String songType) {
	this.songType = songType;
}
public Date getDateDownloaded() {
	return dateDownloaded;
}
public void setDateDownloaded(Date dateDownloaded) {
	this.dateDownloaded = dateDownloaded;
}
public double getRating() {
	return Rating;
}
public void setRating(double rating) {
	Rating = rating;
}
public int getNumberOfDownloads() {
	return numberOfDownloads;
}
public void setNumberOfDownloads(int numberOfDownloads) {
	this.numberOfDownloads = numberOfDownloads;
}
public Song(String name, String artist, String songType, Date dateDownloaded, double rating, int numberOfDownloads) {
	super();
	this.name = name;
	this.artist = artist;
	this.songType = songType;
	this.dateDownloaded = dateDownloaded;
	this.Rating = rating;
	this.numberOfDownloads = numberOfDownloads;
}
@Override
public String toString() {
	return String.format("%-15s-15s%-15s%-15s%-15s%-15s%",name,artist,songType,dateDownloaded,Rating,numberOfDownloads);
}
public static Song createSong(String details) {
	SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
	Song song=null;
	try {
		song = new Song(details.split(",")[0],details.split(",")[1],details.split(",")[2],sdf.parse(details.split(",")[3]),
				Double.parseDouble(details.split(",")[4]),Integer.parseInt(details.split(",")[5]));
	} catch (NumberFormatException e) {
		System.out.println("value must be a number");
		e.printStackTrace();
	} catch (ParseException e) {
		System.out.println("Date format is dd-mm-yyy");
		e.printStackTrace();
	}
	return song;
	
	
	
}
@Override
public int compareTo(Song o) {
	// TODO Auto-generated method stub
	return this.name.compareTo(o.name);
}
@Override
public int hashCode() {
	return Objects.hash(Rating, artist, dateDownloaded, name, numberOfDownloads, songType);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Song other = (Song) obj;
	return Double.doubleToLongBits(Rating) == Double.doubleToLongBits(other.Rating)
			&& Objects.equals(artist, other.artist) && Objects.equals(dateDownloaded, other.dateDownloaded)
			&& Objects.equals(name, other.name) && numberOfDownloads == other.numberOfDownloads
			&& Objects.equals(songType, other.songType);
}
public Song() {
	super();
	// TODO Auto-generated constructor stub
}


}
