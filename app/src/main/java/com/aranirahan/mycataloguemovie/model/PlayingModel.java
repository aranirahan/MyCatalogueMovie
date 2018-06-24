package com.aranirahan.mycataloguemovie.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PlayingModel {

    @SerializedName("dates")
    private DatesItem dates;

    @SerializedName("page")
    private int page;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("results")
    private ArrayList<ResultsItem> results;

    @SerializedName("total_results")
    private int totalResults;

    public void setDates(DatesItem dates) {
        this.dates = dates;
    }

    public DatesItem getDates() {
        return dates;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setResults(ArrayList<ResultsItem> results) {
        this.results = results;
    }

    public ArrayList<ResultsItem> getResults() {
        return results;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalResults() {
        return totalResults;
    }

    @Override
    public String toString() {
        return
                "PlayingModel{" +
                        "dates = '" + dates + '\'' +
                        ",page = '" + page + '\'' +
                        ",total_pages = '" + totalPages + '\'' +
                        ",results = '" + results + '\'' +
                        ",total_results = '" + totalResults + '\'' +
                        "}";
    }
}