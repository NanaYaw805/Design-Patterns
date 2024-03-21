package VisitorPattern;

public class HighLightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight node");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Anchor node");

    }
}
