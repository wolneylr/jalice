/* This file was generated by SableCC (http://www.sablecc.org/). */

package Jalice.node;

import Jalice.analysis.*;

@SuppressWarnings("nls")
public final class TEscreva extends Token
{
    public TEscreva()
    {
        super.setText("escreva");
    }

    public TEscreva(int line, int pos)
    {
        super.setText("escreva");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEscreva(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEscreva(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEscreva text.");
    }
}
