/*
 * Copyright (C) 2017 | TS Applications Pty Ltd
 * All Rights Reserved.
 */

package com.optus.sample.ui.handlers


interface OnModelClickListener<in T : Any> {
    fun onClick(model: T)
}