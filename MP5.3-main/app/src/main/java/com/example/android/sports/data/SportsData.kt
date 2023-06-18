/*
 * Copyright (c) 2021 The Android Open Source Project
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

package com.example.android.sports.data

import com.example.android.sports.R
import com.example.android.sports.model.Sport

/**
 * Sports data
 */
object SportsData{
    fun getSportsData(): ArrayList<Sport> {
        return arrayListOf(
            Sport(
                id = 1,
                titleResourceId = R.string.city,
                subTitleResourceId = R.string.city_subtitle,
                imageResourceId = R.drawable.city,
                sportsImageBanner = R.drawable.city
            ),
            Sport(
                id = 2, titleResourceId = R.string.rose,
                subTitleResourceId = R.string.rose_subtitle,
                imageResourceId = R.drawable.rose,
                sportsImageBanner = R.drawable.rose
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.junction,
                subTitleResourceId =R.string.junction_subtitle,
                imageResourceId = R.drawable.junction,
                sportsImageBanner = R.drawable.junction
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.mustang,
                subTitleResourceId = R.string.mustang_subtitle,
                imageResourceId = R.drawable.mustang,
                sportsImageBanner = R.drawable.mustang
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.eifel,
                subTitleResourceId = R.string.eifel_subtitle,
                imageResourceId = R.drawable.eifel,
                sportsImageBanner = R.drawable.eifel
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.aurora,
                subTitleResourceId = R.string.aurora_subtitle,
                imageResourceId = R.drawable.aourora,
                sportsImageBanner = R.drawable.aourora
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.food,
                subTitleResourceId = R.string.food_subtitle,
                imageResourceId = R.drawable.food,
                sportsImageBanner = R.drawable.food
            ),
            Sport(
                id = 8,
                titleResourceId = R.string.motogp,
                subTitleResourceId = R.string.motogp_subtitle,
                imageResourceId = R.drawable.motogp,
                sportsImageBanner = R.drawable.motogp
            ),
            Sport(
                id = 9,
                titleResourceId = R.string.diving,
                subTitleResourceId = R.string.diving_subtitle,
                imageResourceId = R.drawable.diving,
                sportsImageBanner = R.drawable.diving
            ),
            Sport(
                id = 10,
                titleResourceId = R.string.pantai,
                subTitleResourceId =R.string.pantai_subtitle,
                imageResourceId = R.drawable.pantai,
                sportsImageBanner = R.drawable.pantai
            ),
            Sport(
                id = 11,
                titleResourceId = R.string.office,
                subTitleResourceId = R.string.office_subtitle,
                imageResourceId = R.drawable.office,
                sportsImageBanner = R.drawable.office
            )

        )
    }
}
