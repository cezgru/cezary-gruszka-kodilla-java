package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int userCount;
    private int postCount;
    private int commentCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.userCount = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.commentCount = statistics.commentsCount();

        if (postCount != 0) {
            this.averagePostsPerUser = postCount / (double)userCount;
        } else {
            this.averagePostsPerUser = 0;
        }

        if (commentCount != 0) {
            this.averageCommentsPerUser = commentCount / (double)userCount;
        } else {
            this.averageCommentsPerUser = 0;
        }

        if (commentCount != 0) {
            this.averageCommentsPerPost = commentCount / (double)postCount;
        } else {
            this.averageCommentsPerPost = 0;
        }
    }
}
