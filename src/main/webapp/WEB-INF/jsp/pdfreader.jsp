<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>FileReader Example</title>

    <script type="text/javascript" charset="utf-8" src="cordova-1.8.1.js"></script>
    <script type="text/javascript" charset="utf-8">

    // Wait for Cordova to load
    //
    function onLoad() {
        document.addEventListener("deviceready", onDeviceReady, false);
    }

    // Cordova is ready
    //
    function onDeviceReady() {
        window.requestFileSystem([LocalFileSystem](../localfilesystem/localfilesystem.html).PERSISTENT, 0, gotFS, fail);
    }

    function gotFS(fileSystem) {
        fileSystem.root.getFile("readme.txt", null, gotFileEntry, fail);
    }

    function gotFileEntry(fileEntry) {
        fileEntry.file(gotFile, fail);
    }

    function gotFile(file){
        readDataUrl(file);
        readAsText(file);
    }

    function readDataUrl(file) {
        var reader = new FileReader();
        reader.onloadend = function(evt) {
            console.log("Read as data URL");
            console.log(evt.target.result);
        };
        reader.readAsDataURL(file);
    }

    function readAsText(file) {
        var reader = new FileReader();
        reader.onloadend = function(evt) {
            console.log("Read as text");
            console.log(evt.target.result);
        };
        reader.readAsText(file);
    }

    function fail(evt) {
        console.log(evt.target.error.code);
    }

    </script>
  </head>
  <body>
    <h1>Example</h1>
    <p>Read File</p>
  </body>
</html>