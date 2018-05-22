/* This file was generated by SableCC (http://www.sablecc.org/). */

package Jalice.node;

import Jalice.analysis.*;

@SuppressWarnings("nls")
public final class TAbreParent extends Token
{
    public TAbreParent()
    {
        super.setText("(");
    }

    public TAbreParent(int line, int pos)
    {
        super.setText("(");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAbreParent(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAbreParent(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAbreParent text.");
    }
}
