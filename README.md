<h1> Data Backup Application</h1>

## Overview
This application is designed to backup data older than 31 days from the download folder to Google Firebase Storage and delete the original files. It also provides options to download those files. The application caches the most frequently used files in a cache folder inside the downloads folder. It also has an option to upload and download files manually.

## Features
- **Automatic Backup**: The application automatically backs up files from the download folder that are older than 31 days to Google Firebase Storage and deletes the original files.
- **File Download**: Users can download the backed-up files from Google Firebase Storage.
- **Caching**: The application caches the most frequently used files in a cache folder inside the downloads folder.
- **Manual Upload and Download**: The application provides an option to manually upload and download files.
- **Accessibility**: The application includes a talkback service for accessibility.
- **Activities**: The application includes three activities, including interaction with sensor and handling network failure.

<h2> Screenshots</h2>
<p align="center">
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image1.png" width="250" height=auto>
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image3.png" width="250" height=auto>
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image4.png" width="250" height=auto>
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image2.png" width="250" height=auto>
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image5.png" width="250" height=auto>
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image6.png" width="250" height=auto>
<img src="https://github.com/DeepanshuDabas03/DataBackupApp-Project/blob/master/image7.png" width="250" height=auto>
</p>

## Getting Started
1. Clone the repository to your local machine or download the latest release file from [here](https://github.com/DeepanshuDabas03/DataBackupApp-Project/releases/download/v1.0.0/DataBackup.apk) .
2. You can also get source code from [here](https://github.com/DeepanshuDabas03/DataBackupApp-Project/archive/refs/tags/v1.0.0.zip)
3. Open the project in your Android Studio or if using prebuild apk, directly install in android device.
4. Run the application.
5. For accessing downloads folder or any folder in latest android security feature, the application requires all read write access and asks use for the permission.
6. On successful grant of permission the application will work as a databackup application.
7. If you don't want automatic backup feature, you can use manual download and upload feature also. The application will get access to the files you grant access to in that case. 

## Usage
1. To use the automatic backup feature, simply place the files you want to backup in the download folder. The application will automatically back up files older than 31 days to Google Firebase Storage and delete the original files.
2. To download a file, navigate to the download option and select the file you want to download.
3. To cache a file, simply use the file frequently. The application will automatically cache the most frequently used files.
4. To manually upload or download a file, navigate to the manual upload or download option and select the file you want to upload or download.
