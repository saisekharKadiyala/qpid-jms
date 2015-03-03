/* Generated By:JavaCC: Do not edit this line. SelectorParserImplTokenManager.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.qpid.jms.selector.parser;
import java.io.*;
import java.util.*;
import org.apache.qpid.jms.selector.filter.*;

/** Token Manager. */
public class SelectorParserImplTokenManager implements SelectorParserImplConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(5, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(5, 0);
      case 12:
         jjmatchedKind = 5;
         return jjMoveNfa_0(5, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(5, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(5, 0);
      case 37:
         jjmatchedKind = 40;
         return jjMoveNfa_0(5, 0);
      case 40:
         jjmatchedKind = 33;
         return jjMoveNfa_0(5, 0);
      case 41:
         jjmatchedKind = 35;
         return jjMoveNfa_0(5, 0);
      case 42:
         jjmatchedKind = 38;
         return jjMoveNfa_0(5, 0);
      case 43:
         jjmatchedKind = 36;
         return jjMoveNfa_0(5, 0);
      case 44:
         jjmatchedKind = 34;
         return jjMoveNfa_0(5, 0);
      case 45:
         jjmatchedKind = 37;
         return jjMoveNfa_0(5, 0);
      case 47:
         jjmatchedKind = 39;
         return jjMoveNfa_0(5, 0);
      case 60:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x110000000L);
      case 61:
         jjmatchedKind = 27;
         return jjMoveNfa_0(5, 0);
      case 62:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0xc000L);
      case 76:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x40100L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xc000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40100L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 0);
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
         }
         break;
      case 62:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 28;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 78:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 82:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 83:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 114:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 115:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 1);
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 68:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         break;
      case 75:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x60000L);
      case 84:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 100:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         break;
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x60000L);
      case 116:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 2);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 2);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 69:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 3;
         }
         break;
      case 76:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 87:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 3;
         }
         break;
      case 108:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 3);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 3);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 80:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 4);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 4);
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 5);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 5);
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 6;
         }
         break;
      case 110:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 6;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 6);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 48;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 3);
                  else if (curChar == 34)
                     jjCheckNAddStates(4, 6);
                  else if (curChar == 36)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAdd(27);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(7, 9);
                  else if (curChar == 46)
                     jjCheckNAdd(17);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                     jjCheckNAddTwoStates(14, 15);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAddTwoStates(45, 47);
                  }
                  break;
               case 0:
                  if (curChar == 45)
                     jjCheckNAddStates(10, 12);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 7:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 42)
                     jjCheckNAddStates(13, 15);
                  break;
               case 9:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 10:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 11:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 12:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 13:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAddTwoStates(14, 15);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAddTwoStates(14, 15);
                  break;
               case 16:
                  if (curChar == 46)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(17, 18);
                  break;
               case 19:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(20);
                  break;
               case 21:
               case 22:
                  if (curChar == 39)
                     jjCheckNAddStates(7, 9);
                  break;
               case 23:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(7, 9);
                  break;
               case 25:
                  if (curChar == 39 && kind > 24)
                     kind = 24;
                  break;
               case 26:
                  if (curChar != 36)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(27);
                  break;
               case 27:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(27);
                  break;
               case 28:
               case 29:
                  if (curChar == 34)
                     jjCheckNAddStates(4, 6);
                  break;
               case 30:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 32:
                  if (curChar == 34 && kind > 26)
                     kind = 26;
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 3);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(34, 35);
                  break;
               case 35:
                  if (curChar != 46)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(36, 37);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAddTwoStates(36, 37);
                  break;
               case 38:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(39);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(39);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 42:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(43);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(43);
                  break;
               case 44:
                  if (curChar != 48)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddTwoStates(45, 47);
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 47:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(47);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
               case 27:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(27);
                  break;
               case 1:
                  jjAddStates(10, 12);
                  break;
               case 7:
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
               case 10:
                  jjCheckNAddTwoStates(10, 8);
                  break;
               case 15:
                  if ((0x100000001000L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 18:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(16, 17);
                  break;
               case 24:
                  jjAddStates(7, 9);
                  break;
               case 31:
                  jjAddStates(4, 6);
                  break;
               case 37:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(18, 19);
                  break;
               case 41:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(20, 21);
                  break;
               case 45:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(46);
                  break;
               case 46:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(46);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(10, 12);
                  break;
               case 7:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 24:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(7, 9);
                  break;
               case 31:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(4, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 48 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   34, 35, 40, 41, 30, 31, 32, 23, 24, 25, 1, 2, 4, 8, 9, 11, 
   19, 20, 38, 39, 42, 43, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
"\75", "\74\76", "\76", "\76\75", "\74", "\74\75", "\50", "\54", "\51", "\53", "\55", 
"\52", "\57", "\45", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffff7fff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static final long[] jjtoSpecial = {
   0x3eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[48];
private final int[] jjstateSet = new int[96];
protected char curChar;
/** Constructor. */
public SelectorParserImplTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public SelectorParserImplTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 48; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
