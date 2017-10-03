/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.html.editor.test;

import org.netbeans.api.html.lexer.HTMLTokenId;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.MultiFileSystem;
import org.openide.filesystems.Repository;
import org.openide.filesystems.XMLFileSystem;
import org.xml.sax.SAXException;

/**
 * Repository whose getDefaultFileSystem returns a writeable FS containing
 * the layer of the html editor module. It is put in the default lookup,
 * thus it is returned by Repository.getDefault().
 *
 * @author Andrei Badea, Marek Fukala
 */
public class RepositoryImpl extends Repository {
    
    private XMLFileSystem system;
    
    public RepositoryImpl() {
        super(createDefFs());
    }
    
    private static FileSystem createDefFs() {
        try
        {
            FileSystem writeFs = FileUtil.createMemoryFileSystem();
            FileSystem htmlFs = new XMLFileSystem(RepositoryImpl.class.getClassLoader().getResource("org/netbeans/modules/html/mf-layer.xml"));
            FileSystem htmlEditotFs = new XMLFileSystem(RepositoryImpl.class.getClassLoader().getResource("org/netbeans/modules/html/editor/resources/layer.xml"));
            FileSystem htmlEditorLibFs = new XMLFileSystem(RepositoryImpl.class.getClassLoader().getResource("org/netbeans/modules/html/editor/resources/layer.xml"));
            FileSystem lexerLayerFS = new XMLFileSystem(HTMLTokenId.class.getClassLoader().getResource("org/netbeans/lib/html/lexer/layer.xml"));
            FileSystem cssEditorFs = new XMLFileSystem(RepositoryImpl.class.getClassLoader().getResource("org/netbeans/modules/css/resources/layer.xml"));
            FileSystem jsEditorFs = new XMLFileSystem(RepositoryImpl.class.getClassLoader().getResource("org/netbeans/modules/javascript/editing/layer.xml"));
            return new MultiFileSystem(new FileSystem[] { writeFs, lexerLayerFS, htmlFs, 
                                                          htmlEditotFs, htmlEditorLibFs,
                                                          cssEditorFs, jsEditorFs});
        } catch (SAXException e) {
            return null;
        }
    }
}