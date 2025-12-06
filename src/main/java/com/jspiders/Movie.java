package com.jspiders;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="movie")
public class Movie {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long movieid;

        @Column(name="title",nullable=false)
        private String title;

        @Column(name="language",nullable=false)
        private String language;

        @Column(name="duration",nullable=false)
        private Integer duration;

        @Column(name="certification",nullable=false)
        private String certification;

        @Column(name="status")
        @Enumerated(EnumType.STRING)
        private MovieStatus status;

        @Column(name="created_at",nullable=false)
        private LocalDate createdAt;

        @Column(name="updated_at")
        private LocalDate updatedAt;

        @Column(name="created_by",nullable=false)
        private Long  createdBy;

        @Column(name="updated_by")
        private Long updatedBy;


        public Long getMovieid() {
            return movieid;
        }

        public void setMovieid(Long movieid) {
            this.movieid = movieid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getCertification() {
            return certification;
        }

        public void setCertification(String certification) {
            this.certification = certification;
        }

        public MovieStatus getStatus() {
            return status;
        }

        public void setStatus(MovieStatus status) {
            this.status = status;
        }

        public LocalDate getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(LocalDate createdAt) {
            this.createdAt = createdAt;
        }

        public LocalDate getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(LocalDate updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Long createdBy) {
            this.createdBy = createdBy;
        }

        public Long getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(Long updatedBy) {
            this.updatedBy = updatedBy;
        }

        public String toString(){
            return "Movie_id: "+  movieid+" Movie_title: "+title+" Movie_language: "+language+
                    " Certification: "+certification+" Movie_status: "+status+" Movie_createdAt: "+
                    createdAt+" Movie_createdBy: "+createdBy+" Movie_updatedAt: "+updatedAt+" Movie_updatedBy :"+updatedBy;
        }
    }


