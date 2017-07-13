/*
 * Copyright 2017 Decebal Suiu
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
 */
package ro.fortsoft.pf4j;

/**
 * Thrown when a plugin is not found during a lookup.
 * Useful to distinguish between an error situation, such as unable to copy and
 * the fact that a given plugin could not be found since it was not installed,
 * not present in any of the active repositories etc.
 */
public class PluginNotFoundException extends PluginException {
    public PluginNotFoundException() {
    }

    public PluginNotFoundException(String message) {
        super(message);
    }

    public PluginNotFoundException(Throwable cause) {
        super(cause);
    }

    public PluginNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginNotFoundException(Throwable cause, String message, Object... args) {
        super(cause, message, args);
    }

    public PluginNotFoundException(String message, Object... args) {
        super(message, args);
    }
}
