package com.cicidi.interview.onlineTest;

public class Path {
	private String path;

	public Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public Path cd(String newPath) {
		int lastIndex = newPath.lastIndexOf("..");
		String surPath = newPath.substring(lastIndex + 2, newPath.length());
		if (this.path == null || this.path.isEmpty()) {
			return new Path(surPath);
		}
		int totalCommaToken = findTotalToken(newPath, "..");
		int totalDashToken = findTotalToken(this.path, "/");

		int indexOfLastDash = IndexOfNth(this.path, "/", totalDashToken
				- totalCommaToken + 1);
		String fullPath = "";
		if (indexOfLastDash < 0) {
			fullPath = surPath;
		} else {
			fullPath = this.path.substring(0, indexOfLastDash) + surPath;
		}
		System.out.println(fullPath);
		return new Path(fullPath);
	}

	public int findTotalToken(String path, String key) {
		String findStr = key;
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

			lastIndex = path.indexOf(findStr, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}
		return count;
	}

	public int IndexOfNth(String str, String c, int n) {
		int s = -1;

		for (int i = 0; i < n; i++) {
			s = str.indexOf(c, s + 1);

			if (s == -1)
				break;
		}

		return s;
	}

	public static void main(String[] args) {
		Path path = new Path("/ss/ssc/ssd");
		System.out.println(path.cd("../../../x").getPath());
	}
}