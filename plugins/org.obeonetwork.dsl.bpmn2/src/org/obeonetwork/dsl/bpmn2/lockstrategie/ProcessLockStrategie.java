package org.obeonetwork.dsl.bpmn2.lockstrategie;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.viewpoint.collab.api.lock.strategy.*;

import fr.obeo.dsl.viewpoint.collab.api.lock.ViewpointCDOLockStrategy;
import fr.obeo.dsl.viewpoint.collab.api.util.CDOViewpointUtil;
import fr.obeo.dsl.common.tools.api.util.Option;

import org.eclipse.emf.cdo.*;
import org.eclipse.emf.common.notify.*;
import org.obeonetwork.dsl.bpmn2.impl.TaskImpl;

public class ProcessLockStrategie extends DefaultLockStrategy implements ViewpointCDOLockStrategy {

    public boolean isRelevantNotification(Notification notification) {
        boolean isRelevantNotification = false;
        if (notification.getNotifier() instanceof EObject) {
            Option<CDOObject> notifier = CDOViewpointUtil.getCDOObject((EObject) notification
                    .getNotifier());
            if (notifier.some()) {
                isRelevantNotification = notification.getNotifier() instanceof TaskImpl;
            }
        }

        System.out.println("isRelevantNotification===" + isRelevantNotification);
        return isRelevantNotification;
    }

    public Collection<? extends CDOObject> getElementsToLock(Notification notification) {

        Collection<CDOObject> elementsToLock = new HashSet<CDOObject>();

        Option<CDOObject> notifier = CDOViewpointUtil.getCDOObject((EObject) notification
                .getNotifier());

        boolean isConcerningATask = notification.getNotifier() instanceof TaskImpl;
        if (isConcerningATask) {

            System.out.println("hello : " + notification.getNotifier());

            //   CDOLockManager.INSTANCE.lockElementsFromNotification(notification);

            //    CDOLockManager.INSTANCE.lockElementsFromNotification(notification);

            //  elementsToLock.add((CDOObject) notifier.get());

        } else {
            //
            //  Viewpoint default lock strategy

            super.getElementsToLock(notification);

        }
        return elementsToLock;
    }
}
