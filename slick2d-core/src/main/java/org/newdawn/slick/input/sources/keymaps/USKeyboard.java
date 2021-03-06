package org.newdawn.slick.input.sources.keymaps;

import org.lwjgl.glfw.GLFW;

public interface USKeyboard {
    int KEYBOARD_SIZE = 256;

    public static final int KEY_ESCAPE          = GLFW.GLFW_KEY_ESCAPE;
    public static final int KEY_1               = GLFW.GLFW_KEY_1;
    public static final int KEY_2               = GLFW.GLFW_KEY_2;
    public static final int KEY_3               = GLFW.GLFW_KEY_3;
    public static final int KEY_4               = GLFW.GLFW_KEY_4;
    public static final int KEY_5               = GLFW.GLFW_KEY_5;
    public static final int KEY_6               = GLFW.GLFW_KEY_6;
    public static final int KEY_7               = GLFW.GLFW_KEY_7;
    public static final int KEY_8               = GLFW.GLFW_KEY_8;
    public static final int KEY_9               = GLFW.GLFW_KEY_9;
    public static final int KEY_0               = GLFW.GLFW_KEY_0;
    public static final int KEY_MINUS           = GLFW.GLFW_KEY_MINUS; /* - on main keyboard */
    public static final int KEY_EQUALS          = GLFW.GLFW_KEY_EQUAL;
    public static final int KEY_BACK            = GLFW.GLFW_KEY_BACKSPACE; /* backspace */
    public static final int KEY_TAB             = GLFW.GLFW_KEY_TAB;
    public static final int KEY_Q               = GLFW.GLFW_KEY_Q;
    public static final int KEY_W               = GLFW.GLFW_KEY_W;
    public static final int KEY_E               = GLFW.GLFW_KEY_E;
    public static final int KEY_R               = GLFW.GLFW_KEY_R;
    public static final int KEY_T               = GLFW.GLFW_KEY_T;
    public static final int KEY_Y               = GLFW.GLFW_KEY_Y;
    public static final int KEY_U               = GLFW.GLFW_KEY_U;
    public static final int KEY_I               = GLFW.GLFW_KEY_I;
    public static final int KEY_O               = GLFW.GLFW_KEY_O;
    public static final int KEY_P               = GLFW.GLFW_KEY_P;
    public static final int KEY_LBRACKET        = GLFW.GLFW_KEY_LEFT_BRACKET;
    public static final int KEY_RBRACKET        = GLFW.GLFW_KEY_RIGHT_BRACKET;
    public static final int KEY_RETURN          = GLFW.GLFW_KEY_ENTER; /* Enter on main keyboard */
    public static final int KEY_ENTER           = GLFW.GLFW_KEY_ENTER; /* Enter on main keyboard */
    public static final int KEY_LCONTROL        = GLFW.GLFW_KEY_LEFT_CONTROL;
    public static final int KEY_A               = GLFW.GLFW_KEY_A;
    public static final int KEY_S               = GLFW.GLFW_KEY_S;
    public static final int KEY_D               = GLFW.GLFW_KEY_D;
    public static final int KEY_F               = GLFW.GLFW_KEY_F;
    public static final int KEY_G               = GLFW.GLFW_KEY_G;
    public static final int KEY_H               = GLFW.GLFW_KEY_H;
    public static final int KEY_J               = GLFW.GLFW_KEY_J;
    public static final int KEY_K               = GLFW.GLFW_KEY_K;
    public static final int KEY_L               = GLFW.GLFW_KEY_L;
    public static final int KEY_SEMICOLON       = GLFW.GLFW_KEY_SEMICOLON;
    public static final int KEY_APOSTROPHE      = GLFW.GLFW_KEY_APOSTROPHE;
    public static final int KEY_GRAVE           = GLFW.GLFW_KEY_GRAVE_ACCENT; /* accent grave */
    public static final int KEY_LSHIFT          = GLFW.GLFW_KEY_LEFT_SHIFT;
    public static final int KEY_BACKSLASH       = GLFW.GLFW_KEY_BACKSLASH;
    public static final int KEY_Z               = GLFW.GLFW_KEY_Z;
    public static final int KEY_X               = GLFW.GLFW_KEY_X;
    public static final int KEY_C               = GLFW.GLFW_KEY_C;
    public static final int KEY_V               = GLFW.GLFW_KEY_V;
    public static final int KEY_B               = GLFW.GLFW_KEY_B;
    public static final int KEY_N               = GLFW.GLFW_KEY_N;
    public static final int KEY_M               = GLFW.GLFW_KEY_M;
    public static final int KEY_COMMA           = GLFW.GLFW_KEY_COMMA;
    public static final int KEY_PERIOD          = GLFW.GLFW_KEY_PERIOD; /* . on main keyboard */
    public static final int KEY_SLASH           = GLFW.GLFW_KEY_SLASH; /* / on main keyboard */
    public static final int KEY_RSHIFT          = GLFW.GLFW_KEY_RIGHT_SHIFT;
    public static final int KEY_MULTIPLY        = GLFW.GLFW_KEY_KP_MULTIPLY; /* * on numeric keypad */ //TODO test this
    public static final int KEY_LMENU           = GLFW.GLFW_KEY_LEFT_ALT; /* left Alt */
    public static final int KEY_SPACE           = GLFW.GLFW_KEY_SPACE;
    public static final int KEY_CAPITAL         = GLFW.GLFW_KEY_CAPS_LOCK;
    public static final int KEY_F1              = GLFW.GLFW_KEY_F1;
    public static final int KEY_F2              = GLFW.GLFW_KEY_F2;
    public static final int KEY_F3              = GLFW.GLFW_KEY_F3;
    public static final int KEY_F4              = GLFW.GLFW_KEY_F4;
    public static final int KEY_F5              = GLFW.GLFW_KEY_F5;
    public static final int KEY_F6              = GLFW.GLFW_KEY_F6;
    public static final int KEY_F7              = GLFW.GLFW_KEY_F7;
    public static final int KEY_F8              = GLFW.GLFW_KEY_F8;
    public static final int KEY_F9              = GLFW.GLFW_KEY_F9;
    public static final int KEY_F10             = GLFW.GLFW_KEY_F10;
    public static final int KEY_NUMLOCK         = GLFW.GLFW_KEY_NUM_LOCK;
    public static final int KEY_SCROLL          = GLFW.GLFW_KEY_SCROLL_LOCK; /* Scroll Lock */
    public static final int KEY_NUMPAD7         = GLFW.GLFW_KEY_KP_7;
    public static final int KEY_NUMPAD8         = GLFW.GLFW_KEY_KP_8;
    public static final int KEY_NUMPAD9         = GLFW.GLFW_KEY_KP_9;
    public static final int KEY_SUBTRACT        = GLFW.GLFW_KEY_KP_SUBTRACT; /* - on numeric keypad */
    public static final int KEY_NUMPAD4         = GLFW.GLFW_KEY_KP_4;
    public static final int KEY_NUMPAD5         = GLFW.GLFW_KEY_KP_5;
    public static final int KEY_NUMPAD6         = GLFW.GLFW_KEY_KP_6;
    public static final int KEY_ADD             = GLFW.GLFW_KEY_KP_ADD; /* + on numeric keypad */
    public static final int KEY_NUMPAD1         = GLFW.GLFW_KEY_KP_1;
    public static final int KEY_NUMPAD2         = GLFW.GLFW_KEY_KP_2;
    public static final int KEY_NUMPAD3         = GLFW.GLFW_KEY_KP_3;
    public static final int KEY_NUMPAD0         = GLFW.GLFW_KEY_KP_0;
    public static final int KEY_DECIMAL         = GLFW.GLFW_KEY_KP_DECIMAL; /* . on numeric keypad */
    public static final int KEY_F11             = GLFW.GLFW_KEY_F11;
    public static final int KEY_F12             = GLFW.GLFW_KEY_F12;
    public static final int KEY_F13             = GLFW.GLFW_KEY_F13; /*                     (NEC PC98) */
    public static final int KEY_F14             = GLFW.GLFW_KEY_F14; /*                     (NEC PC98) */
    public static final int KEY_F15             = GLFW.GLFW_KEY_F15; /*                     (NEC PC98) */
    // FIXME add JP keyboard support at some point
//	public static final int KEY_KANA            = GLFW.; /* (Japanese keyboard)            */
//	public static final int KEY_CONVERT         = GLFW.; /* (Japanese keyboard)            */
//	public static final int KEY_NOCONVERT       = GLFW.; /* (Japanese keyboard)            */
//	public static final int KEY_YEN             = GLFW.; /* (Japanese keyboard)            */
    public static final int KEY_NUMPADEQUALS    = GLFW.GLFW_KEY_EQUAL; /* = on numeric keypad (NEC PC98) */
    //	public static final int KEY_CIRCUMFLEX      = GLFW.; /* (Japanese keyboard)            */
//	public static final int KEY_AT              = GLFW.; /*                     (NEC PC98) */
    public static final int KEY_COLON           = GLFW.GLFW_KEY_SEMICOLON; /*                     (NEC PC98) */
    //	public static final int KEY_UNDERLINE       = GLFW.; /*                     (NEC PC98) */
//	public static final int KEY_KANJI           = GLFW.; /* (Japanese keyboard)            */
//	public static final int KEY_STOP            = GLFW.; /*                     (NEC PC98) */
//	public static final int KEY_AX              = GLFW.; /*                     (Japan AX) */
    public static final int KEY_UNLABELED       = GLFW.GLFW_KEY_UNKNOWN; /*                        (J3100) */
    public static final int KEY_NUMPADENTER     = GLFW.GLFW_KEY_KP_ENTER; /* Enter on numeric keypad */
    public static final int KEY_RCONTROL        = GLFW.GLFW_KEY_RIGHT_CONTROL;
    //	public static final int KEY_NUMPADCOMMA     = GLFW.; /* , on numeric keypad (NEC PC98) */
    public static final int KEY_DIVIDE          = GLFW.GLFW_KEY_KP_DIVIDE; /* / on numeric keypad */
    //	public static final int KEY_SYSRQ           = GLFW.; // todo no clue what this is
    public static final int KEY_RMENU           = GLFW.GLFW_KEY_RIGHT_ALT; /* right Alt */
    public static final int KEY_PAUSE           = GLFW.GLFW_KEY_PAUSE; /* Pause */
    public static final int KEY_HOME            = GLFW.GLFW_KEY_HOME; /* Home on arrow keypad */
    public static final int KEY_UP              = GLFW.GLFW_KEY_UP; /* UpArrow on arrow keypad */
    public static final int KEY_PRIOR           = GLFW.GLFW_KEY_PAGE_UP; /* PgUp on arrow keypad */
    public static final int KEY_LEFT            = GLFW.GLFW_KEY_LEFT; /* LeftArrow on arrow keypad */
    public static final int KEY_RIGHT           = GLFW.GLFW_KEY_RIGHT; /* RightArrow on arrow keypad */
    public static final int KEY_END             = GLFW.GLFW_KEY_END; /* End on arrow keypad */
    public static final int KEY_DOWN            = GLFW.GLFW_KEY_DOWN; /* DownArrow on arrow keypad */
    //	public static final int KEY_NEXT            = GLFW.; /* PgDn on arrow keypad */
    public static final int KEY_INSERT          = GLFW.GLFW_KEY_INSERT; /* Insert on arrow keypad */
    public static final int KEY_DELETE          = GLFW.GLFW_KEY_DELETE; /* Delete on arrow keypad */
    public static final int KEY_LWIN            = GLFW.GLFW_KEY_LEFT_SUPER; /* Left Windows key */
    public static final int KEY_RWIN            = GLFW.GLFW_KEY_RIGHT_SUPER; /* Right Windows key */
//	public static final int KEY_APPS            = GLFW.; /* AppMenu key */
//	public static final int KEY_POWER           = GLFW.;
//	public static final int KEY_SLEEP           = GLFW.;

    /** A helper for left ALT */
    public static final int KEY_LALT = KEY_LMENU;
    /** A helper for right ALT */
    public static final int KEY_RALT = KEY_RMENU;
}
