/*
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

package org.netbeans.api.debugger;

/**
 * This {@link DebuggerManagerListener} modification is designed to be
 * registered in
 * "META-INF/debugger/org.netbeans.api.debugger.LazyDebuggerManagerListener".
 * New instance of LazyDebuggerManagerListener implementation is loaded
 * when the new instance of {@link DebuggerManager} is created, and is registered
 * automatically to all properties returned by {@link #getProperties}.
 *
 * @author   Jan Jancura
 */
public interface LazyDebuggerManagerListener extends DebuggerManagerListener {

    /**
     * Returns list of properties this listener is listening on.
     *
     * @return list of properties this listener is listening on
     */
    public String[] getProperties ();
}
