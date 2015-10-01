//Greg Maka

import java.util.*;

public class RecordingSort {	

	public static void main(String[] args) {

		Recording[] list = new Recording[5];

		Scanner input = new Scanner(System.in);

		int i = 0;
	
		for (i = 0; i < list.length; i++) {
			int j = i + 1;

			System.out.print("Enter song " + j + "'s title: ");
			String title = input.nextLine();

			System.out.print("Enter song " + j + "'s artist: ");
			String artist = input.nextLine();

			System.out.print("Enter song " + j + "'s playing time in seconds: ");
			String playingTimeString = input.nextLine();

			int playingTime = Integer.parseInt(playingTimeString);


			list[i] = new Recording(title, artist, playingTime);


			System.out.println();
		}
		

		int sortMethod;
		// asks user how songs should be sorted. User enters number that corresponds to their choice.
		do {
			System.out.println("How should these songs be sorted? 1) title 2) artist 3) playing time");
			sortMethod = input.nextInt();

			if (sortMethod > 0 && sortMethod < 4) {
				int a, b;
				int highestVal = list.length - 1;
				// bubble sort
				for (a = 0; a < highestVal; a++) {
					for (b = 0; b < highestVal; b++) {
						int c = b + 1;
						
						// sorts by titles
						if (sortMethod == 1) {

							if (list[b].getTitle().compareTo(list[c].getTitle()) > 0) {

								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						} 
						// sorts by artist
						else if (sortMethod == 2) {

							if (list[b].getArtist().compareTo(list[c].getArtist()) > 0) {

								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						} 
						// sort by playing time
						else if (sortMethod == 3) {

							if (list[b].getPlayingTime() > list[c].getPlayingTime()) {

								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						}
					}
				}
			}
			else {
				System.out.println("Invalid choice. Please choose 1, 2, or 3.");
			}
		} while (sortMethod < 1 || sortMethod > 3);
		

		System.out.println();

		for (i = 0; i < list.length; i++) {
			System.out.println("Song: Title: " + list[i].getTitle() + ". Artist: " + list[i].getArtist() + ". Playing time: "
					+ list[i].getPlayingTime() + " seconds.");
		}
		
		input.close();

	}
}