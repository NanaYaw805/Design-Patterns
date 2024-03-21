package TemplateMethodPattern;

public class GenerateReportTax extends Task {
    private AuditTrail auditTrail;



    public GenerateReportTax() {
        this.auditTrail = auditTrail;
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating report tax...");

    }
}
