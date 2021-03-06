/*
 * (C) Copyright 2009 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Thomas Roger
 */

package org.nuxeo.ecm.platform.importer.filter;

import org.nuxeo.ecm.platform.importer.source.SourceNode;

/**
 * Interface for filters used to chose if a {@code SourceNode} should be imported or not.
 *
 * @author <a href="mailto:troger@nuxeo.com">Thomas Roger</a>
 */
public interface ImportingDocumentFilter {

    /**
     * Returns {@code true} if the given {@code SourceNode} should be imported, {@code false} otherwise.
     */
    public boolean shouldImportDocument(SourceNode sourceNode);

}
