package com.venom.livefaceer.customview;

import java.util.List;
import com.venom.livefaceer.tflite.SimilarityClassifier.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
