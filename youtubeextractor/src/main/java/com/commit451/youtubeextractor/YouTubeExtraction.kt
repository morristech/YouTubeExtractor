package com.commit451.youtubeextractor

/**
 * The result of [YouTubeExtractor.extract]
 */
class YouTubeExtraction(val videoId: String,
                        val title: String,
                        val videoStreams: List<VideoStream>,
                        val thumbnails: List<Thumbnail>)