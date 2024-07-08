package yycpetresort;

import java.util.Date;

public class Report {
    private String reportType;
    private Date generationDate;

    public Report(String reportType, Date generationDate) {
        this.reportType = reportType;
        this.generationDate = generationDate;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }
}
