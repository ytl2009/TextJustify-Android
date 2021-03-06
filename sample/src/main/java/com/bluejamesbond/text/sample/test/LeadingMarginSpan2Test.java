package com.bluejamesbond.text.sample.test;

/*
 * Copyright 2015 Mathew Kurian
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
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * LeadingMarginSpan2Test.java
 * @author Mathew Kurian
 *
 * From TextJustify-Android Library v2.0
 * https://github.com/bluejamesbond/TextJustify-Android
 *
 * Please report any issues
 * https://github.com/bluejamesbond/TextJustify-Android/issues
 *
 * Date: 1/27/15 3:35 AM
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.util.ArticleBuilder;
import com.bluejamesbond.text.sample.helper.MyLeadingMarginSpan2;
import com.bluejamesbond.text.sample.helper.TestActivity;
import com.bluejamesbond.text.style.JustifiedSpan;
import com.bluejamesbond.text.style.LeftSpan;

public class LeadingMarginSpan2Test extends TestActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArticleBuilder amb = new ArticleBuilder();
        amb.append(testName, false, new RelativeSizeSpan(2f), new StyleSpan(Typeface.BOLD),
                new LeftSpan());
        amb.append(
                "<font color=0xFFC801>@levifan</font><font color=0x888888> Oct 9. 28, 2014</font>",
                true, new RelativeSizeSpan(0.8f), new StyleSpan(Typeface.BOLD));
        amb.append(
                "现代计算机中内存空间都是按照byte划分的，从理论上讲似乎对任何类型的变量的访问可以从任何地址开始，<font color=0xFFC801>现代计算机中内存空间都是按照byte划分的，从理论上讲似乎对任何类型的变量的访问可以从任何地址开始</font>，" +
                        "但实际情况是在访问特定变量的时候经一定的规则在空间上排列，而不是顺序的一个接一个的排放，这就是对齐。现代计算机中内存空间都是按照byte划分的，从理论上讲似乎对任何类型的变量的访问可以从任何地址开始，但实际情况是在访问特定变量的时候" +
                        "经一定的规则在空间上排列，而不是顺序的一个接一个的排放，这就是对齐。"
                , false, new RelativeSizeSpan(1f), new JustifiedSpan(),
                new MyLeadingMarginSpan2(2, 100));

        addDocumentView(amb

                , DocumentView.FORMATTED_TEXT);
    }
}
