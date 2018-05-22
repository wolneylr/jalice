/* This file was generated by SableCC (http://www.sablecc.org/). */

package Jalice.node;

import Jalice.analysis.*;

@SuppressWarnings("nls")
public final class TId extends Token
{
    public TId(String text)
    {
        setText(text);
    }

    public TId(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TId(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTId(this);
    }
}
