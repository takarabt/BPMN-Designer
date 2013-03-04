/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.Artifact;
import org.eclipse.bpmn2.Choreography;
import org.eclipse.bpmn2.ConversationAssociation;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.ConversationNode;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.MessageFlowAssociation;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.ParticipantAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.Collaboration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CollaborationValidator {
    boolean validate();

    boolean validateName(String value);

    boolean validateIsClosed(boolean value);

    boolean validateChoreographyRef(EList<Choreography> value);

    boolean validateArtifacts(EList<Artifact> value);

    boolean validateParticipantAssociations(EList<ParticipantAssociation> value);

    boolean validateMessageFlowAssociations(EList<MessageFlowAssociation> value);

    boolean validateConversationAssociations(ConversationAssociation value);

    boolean validateParticipants(EList<Participant> value);

    boolean validateMessageFlows(EList<MessageFlow> value);

    boolean validateCorrelationKeys(EList<CorrelationKey> value);

    boolean validateConversations(EList<ConversationNode> value);

    boolean validateConversationLinks(EList<ConversationLink> value);
}