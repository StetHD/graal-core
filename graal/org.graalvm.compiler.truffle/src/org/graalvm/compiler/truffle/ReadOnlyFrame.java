/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.compiler.truffle;

import org.graalvm.compiler.debug.GraalError;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.MaterializedFrame;

class ReadOnlyFrame implements Frame {
    private final Frame delegate;

    ReadOnlyFrame(Frame delegate) {
        this.delegate = delegate;
    }

    @Override
    @TruffleBoundary
    public FrameDescriptor getFrameDescriptor() {
        return delegate.getFrameDescriptor();
    }

    @Override
    @TruffleBoundary
    public Object[] getArguments() {
        return delegate.getArguments().clone();
    }

    @Override
    @TruffleBoundary
    public Object getObject(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getObject(slot);
    }

    @Override
    @TruffleBoundary
    public void setObject(FrameSlot slot, Object value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public byte getByte(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getByte(slot);
    }

    @Override
    @TruffleBoundary
    public void setByte(FrameSlot slot, byte value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public boolean getBoolean(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getBoolean(slot);
    }

    @Override
    @TruffleBoundary
    public void setBoolean(FrameSlot slot, boolean value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public int getInt(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getInt(slot);
    }

    @Override
    @TruffleBoundary
    public void setInt(FrameSlot slot, int value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public long getLong(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getLong(slot);
    }

    @Override
    @TruffleBoundary
    public void setLong(FrameSlot slot, long value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public float getFloat(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getFloat(slot);
    }

    @Override
    @TruffleBoundary
    public void setFloat(FrameSlot slot, float value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public double getDouble(FrameSlot slot) throws FrameSlotTypeException {
        return delegate.getDouble(slot);
    }

    @Override
    @TruffleBoundary
    public void setDouble(FrameSlot slot, double value) {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public Object getValue(FrameSlot slot) {
        return delegate.getValue(slot);
    }

    @Override
    @TruffleBoundary
    public MaterializedFrame materialize() {
        throw GraalError.shouldNotReachHere();
    }

    @Override
    @TruffleBoundary
    public boolean isObject(FrameSlot slot) {
        return delegate.isObject(slot);
    }

    @Override
    @TruffleBoundary
    public boolean isByte(FrameSlot slot) {
        return delegate.isByte(slot);
    }

    @Override
    @TruffleBoundary
    public boolean isBoolean(FrameSlot slot) {
        return delegate.isBoolean(slot);
    }

    @Override
    @TruffleBoundary
    public boolean isInt(FrameSlot slot) {
        return delegate.isInt(slot);
    }

    @Override
    @TruffleBoundary
    public boolean isLong(FrameSlot slot) {
        return delegate.isLong(slot);
    }

    @Override
    @TruffleBoundary
    public boolean isFloat(FrameSlot slot) {
        return delegate.isFloat(slot);
    }

    @Override
    @TruffleBoundary
    public boolean isDouble(FrameSlot slot) {
        return delegate.isDouble(slot);
    }
}
