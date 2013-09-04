A really simple example of using a user-defined Flow Controller to execute different sequence of UIMA Analysis Engines (AEs) based on extracted content in the underlying document CAS.  The Annotators are dummies - see PersonAnnotator for a better example of NER within UIMA.

Basically, the flow runs an AE that detects "document type".  Based on the outcome of this, it either looks for (a) names & organisations or (b) places.  Once again, the NER annotators here are dummies.

The two important parts are DocTypeFlow and DocTypeFlowController.  Two separate classes here, but it would be well worth having DocTypeFlow as an inner class in DocTypeFlowController.

These classes are accompanied by flow descriptor, which is referenced inside the aggregate AE descriptor DocTypeAggregateDescriptor.xml.

