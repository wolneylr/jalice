/* This file was generated by SableCC (http://www.sablecc.org/). */

package Jalice.node;

import java.util.*;
import Jalice.analysis.*;

@SuppressWarnings("nls")
public final class AInteiroDeclaracao extends PDeclaracao
{
    private TInteiro _inteiro_;
    private TDoispontos _doispontos_;
    private TId _id_;
    private final LinkedList<PDeclnum> _declnum_ = new LinkedList<PDeclnum>();
    private TPontoevirg _pontoevirg_;

    public AInteiroDeclaracao()
    {
        // Constructor
    }

    public AInteiroDeclaracao(
        @SuppressWarnings("hiding") TInteiro _inteiro_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<?> _declnum_,
        @SuppressWarnings("hiding") TPontoevirg _pontoevirg_)
    {
        // Constructor
        setInteiro(_inteiro_);

        setDoispontos(_doispontos_);

        setId(_id_);

        setDeclnum(_declnum_);

        setPontoevirg(_pontoevirg_);

    }

    @Override
    public Object clone()
    {
        return new AInteiroDeclaracao(
            cloneNode(this._inteiro_),
            cloneNode(this._doispontos_),
            cloneNode(this._id_),
            cloneList(this._declnum_),
            cloneNode(this._pontoevirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInteiroDeclaracao(this);
    }

    public TInteiro getInteiro()
    {
        return this._inteiro_;
    }

    public void setInteiro(TInteiro node)
    {
        if(this._inteiro_ != null)
        {
            this._inteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inteiro_ = node;
    }

    public TDoispontos getDoispontos()
    {
        return this._doispontos_;
    }

    public void setDoispontos(TDoispontos node)
    {
        if(this._doispontos_ != null)
        {
            this._doispontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doispontos_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public LinkedList<PDeclnum> getDeclnum()
    {
        return this._declnum_;
    }

    public void setDeclnum(List<?> list)
    {
        for(PDeclnum e : this._declnum_)
        {
            e.parent(null);
        }
        this._declnum_.clear();

        for(Object obj_e : list)
        {
            PDeclnum e = (PDeclnum) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declnum_.add(e);
        }
    }

    public TPontoevirg getPontoevirg()
    {
        return this._pontoevirg_;
    }

    public void setPontoevirg(TPontoevirg node)
    {
        if(this._pontoevirg_ != null)
        {
            this._pontoevirg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoevirg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inteiro_)
            + toString(this._doispontos_)
            + toString(this._id_)
            + toString(this._declnum_)
            + toString(this._pontoevirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inteiro_ == child)
        {
            this._inteiro_ = null;
            return;
        }

        if(this._doispontos_ == child)
        {
            this._doispontos_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._declnum_.remove(child))
        {
            return;
        }

        if(this._pontoevirg_ == child)
        {
            this._pontoevirg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inteiro_ == oldChild)
        {
            setInteiro((TInteiro) newChild);
            return;
        }

        if(this._doispontos_ == oldChild)
        {
            setDoispontos((TDoispontos) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PDeclnum> i = this._declnum_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclnum) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._pontoevirg_ == oldChild)
        {
            setPontoevirg((TPontoevirg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}