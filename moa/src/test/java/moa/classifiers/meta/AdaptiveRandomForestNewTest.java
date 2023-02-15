package moa.classifiers.meta;
import junit.framework.Test;
import junit.framework.TestSuite;
import moa.classifiers.AbstractMultipleClassifierTestCase;
import moa.classifiers.Classifier;

public class AdaptiveRandomForestNewTest
        extends AbstractMultipleClassifierTestCase {
    public AdaptiveRandomForestNewTest(String name) {
        super(name);
        this.setNumberTests(1);
    }

    @Override
    protected Classifier[] getRegressionClassifierSetups() {
        AdaptiveRandomForestNew ARFNTest = new AdaptiveRandomForestNew();
        ARFNTest.ensembleSizeOption.setValue(5);
        ARFNTest.mFeaturesModeOption.setChosenIndex(0);
        ARFNTest.mFeaturesPerTreeSizeOption.setValue(2);

        return new Classifier[]{
                ARFNTest,
        };
    }

    public static Test suite() {
        return new TestSuite(AdaptiveRandomForestTest.class);
    }

    public static void main(String[] args) {
        runTest(suite());
    }
}

