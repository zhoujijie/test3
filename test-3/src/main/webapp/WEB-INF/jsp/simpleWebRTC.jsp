<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <script src="https://webrtc.github.io/adapter/adapter-latest.js"></script> 
        <script src="https://simplewebrtc.com/latest-v3.js"></script> 
    </head>
    <body>
        <video height="300" id="localVideo"></video>
        <video height="300" id="remotesVideos"></video>
    </body>
    
    <script type="text/javascript">
   		var webrtc = new SimpleWebRTC({
    	  // the id/element dom element that will hold "our" video
    	  localVideoEl: 'localVideo',
    	  // the id/element dom element that will hold remote videos
    	  remoteVideosEl: 'remotesVideos',
    	  // immediately ask for camera access
    	  autoRequestMedia: true,
    	  url: 'https://example.com/'
    	});
    
    
   		// we have to wait until it's ready
   		webrtc.on('readyToCall', function () {
   		  // you can name it anything
   		  webrtc.joinRoom('your awesome room name');
   		});
    </script>
</html>
