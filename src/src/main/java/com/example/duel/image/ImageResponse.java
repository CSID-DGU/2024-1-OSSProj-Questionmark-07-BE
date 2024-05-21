package com.example.duel.image;

public class ImageResponse {
    public record UserImageDTO(
            String url
    ) { }

    public record RoadmapImageDTO(
            String url
    ) { }

    public record PostImageDTO(
            String url
    ) { }
}
