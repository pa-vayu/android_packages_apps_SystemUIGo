/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.go;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Root component for Dagger injection on System UI for Android Go.
 */
@Singleton
@Component(modules = {
        GlobalModule.class
})
public interface SystemUIGoGlobalRootComponent extends GlobalRootComponent {
    /** Builder for a SystemUIGoGlobalRootComponent. */
    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        SystemUIGoGlobalRootComponent build();
    }

    /**
     * Builder method for the Android Go System UI subcomponent.
     */
    @Override
    SystemUIGoComponent.Builder getSysUIComponent();
}
