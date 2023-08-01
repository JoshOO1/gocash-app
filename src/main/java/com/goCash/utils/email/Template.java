package com.gusso.gocashtesterapp.utils.email;

import org.springframework.stereotype.Component;

@Component
public class Template {

    public static String accountVerification(String name, String OTP) {
        return "<p style=\"font-family: Helvetica, Arial, sans-serif; font-size: 16px; margin: 0; color: #0b0c0c;\">\n" +
                "    Hello "+ name +",<br><br>\n" +
                "    Welcome to <h1 style=\"font-size: 28px; color: #800000; margin: 0;\">GO CASH</h1>.\n" +
                "    Use this OTP to verify your account.<br><br>\n" +
                "    <strong>{getVerificationOTP(OTP)}</strong>\n" +
                "</p>\n" +
                "\n" +
                "<div style=\"font-family: Helvetica, Arial, sans-serif; font-size: 16px; margin: 0; color: #0b0c0c;\">\n" +
                "    <span style=\"display:none; font-size:1px; color: #fff; max-height:0;\"></span>\n" +
                "    <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse; min-width:100%; width:100%!important;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "        <tbody>\n" +
                "            <tr>\n" +
                "                <td width=\"100%\" height=\"53\" bgcolor=\"#0b0c0c\">\n" +
                "                    <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse; max-width:580px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\n" +
                "                        <tbody>\n" +
                "                            <tr>\n" +
                "                                <td width=\"70\" bgcolor=\"#0b0c0c\" valign=\"middle\">\n" +
                "                                    <table role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;\">\n" +
                "                                        <tbody>\n" +
                "                                            <tr>\n" +
                "                                                <td style=\"padding-left:10px;\"></td>\n" +
                "                                                <td style=\"font-size:28px; line-height:1.315789474; margin-top:4px; padding-left:10px;\">\n" +
                "                                                    <span style=\"font-family:Helvetica, Arial, sans-serif; font-weight:700; color:#800000; text-decoration:none; vertical-align:top; display:inline-block;\">Confirm your email</span>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </tbody>\n" +
                "                                    </table>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                        </tbody>\n" +
                "                    </table>\n" +
                "                </td>\n" +
                "            </tr>\n" +
                "        </tbody>\n" +
                "    </table>\n" +
                "\n" +
                "    <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; max-width:580px; width:100%!important;\" width=\"100%\">\n" +
                "        <tbody>\n" +
                "            <tr>\n" +
                "                <td width=\"10\" height=\"10\" valign=\"middle\"></td>\n" +
                "                <td>\n" +
                "                    <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;\">\n" +
                "                        <tbody>\n" +
                "                            <tr>\n" +
                "                                <td bgcolor=\"#800000\" width=\"100%\" height=\"10\"></td>\n" +
                "                            </tr>\n" +
                "                        </tbody>\n" +
                "                    </table>\n" +
                "                </td>\n" +
                "                <td width=\"10\" valign=\"middle\" height=\"10\"></td>\n" +
                "            </tr>\n" +
                "        </tbody>\n" +
                "    </table>\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; max-width:580px; width:100%!important;\" width=\"100%\">\n" +
                "        <tbody>\n" +
                "            <tr>\n" +
                "                <td height=\"30\"><br></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "                <td style=\"font-family:Helvetica, Arial, sans-serif; font-size:19px; line-height:1.315789474; max-width:560px;\">\n" +
                "                    <p style=\"Margin:0 0 20px 0; font-size:19px; line-height:25px; color:#0b0c0c;\">\n" +
                "                        Hi {name},</p>\n" +
                "                    <p style=\"Margin:0 0 20px 0; font-size:19px; line-height:25px; color:#0b0c0c;\">\n" +
                "                        Thank you for registering with <h1 style=\"font-size: 28px; color: #800000; margin: 0;\">GoCash</h1>.\n" +
                "                        Please use the <h2 style=\"font-size: 24px; color: #800000; margin: 0;\">OTP</h2> below to activate your account:\n" +
                "                    </p>\n" +
                "                    <blockquote style=\"Margin:0 0 20px 0; border-left:10px solid #b1b4b6; padding:15px 0 0.1px 15px; font-size:19px; line-height:25px;\">\n" +
                "                        <p style=\"Margin:0 0 20px 0; font-size:19px; line-height:25px; color:#0b0c0c;\">\n" +
                "                            {getVerificationOTP(OTP)}\n" +
                "                        </p>\n" +
                "                    </blockquote>\n" +
                "                    <p>OTP will expire in 10 minutes.</p>\n" +
                "                    <p>Cheers.</p>\n" +
                "                </td>\n" +
                "                <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td height=\"30\"><br></td>\n" +
                "            </tr>\n" +
                "        </tbody>\n" +
                "    </table>\n" +
                "</div>";

    }


    public static String accountVerifications(String name, String OTP) {
        String appName = "GoCash";
        return "Hello " + name + ",<br><br>\n" +
                "Welcome to <h1 style=\"font-size: 28px; color: #800000; margin: 0;\">" + appName + "</h1>.<br>\n" +
                "Use this OTP to verify your account:<br><br>\n" +
                "<strong style=\"font-size: 24px; color: #800000;\">" + OTP + "</strong><br><br>\n" +
                "OTP will expire in 10 minutes.<br>\n" +
                "Cheers.";
    }

    public static String generatePasswordResetEmail(String recipientName, String resetLink) {
        return "<div style=\"font-family: Helvetica, Arial, sans-serif; font-size: 16px; margin: 0; color: #0b0c0c;\">\n" +
                "<p>Hello " + recipientName + ",</p>\n" +
                "<p>You have requested to reset your password for GoCash account. Please click on the link below to reset your password:</p>\n" +
                "<p style=\"padding: 10px; background-color: #f5f5f5; border: 1px solid #ddd; border-radius: 5px; word-wrap: break-word;\">\n" +
                "<a href=\"" + resetLink + "\">Reset Password</a>\n" +
                "</p>\n" +
                "<p>If you did not request a password reset, you can ignore this email.</p>\n" +
                "<p>Thank you,</p>\n" +
                "<p>The GoCash Team</p>\n" +
                "</div>";
    }


    public static String passwordReset(String name, String OTP) {
//        return public String generatePasswordResetEmail(String recipientName, String resetLink)
            return "Hello " + name + ",\n\n"
                    + "You have requested to reset your password for GoCash account. Please click on the link below to reset your password:\n\n"
                    + /*resetLink*/OTP + "\n\n"
                    + "If you did not request a password reset, you can ignore this email.\n\n"
                    + "Thank you,\n"
                    + "The GoCash Team";
    }

    public static String accountCredited(String name, String OTP) {
        return "Hello " + name + ",\n\nYour new account has been created. Please click the link below to verify your account. \n\n" +
                OTP + "\n\nThe support Team";
    }
    public String generateAccountCreditedEmail(String recipientName, String amountCredited) {
        return "<div style=\"font-family: Helvetica, Arial, sans-serif; font-size: 16px; margin: 0; color: #0b0c0c;\">\n" +
                "<p>Hello " + recipientName + ",</p>\n" +
                "<p>Your GoCash account has been credited with $" + amountCredited + ".</p>\n" +
                "<p>Thank you for using GoCash. If you have any questions or need further assistance, feel free to reach out to our support team.</p>\n" +
                "<p>Best regards,</p>\n" +
                "<p>The GoCash Team</p>\n" +
                "</div>";
    }


    public static String accountBalance(String name, String host, String token) {
        return "Hello " + name + ",\n\nYour new account has been created. Please click the link below to verify your account. \n\n" +
                getVerificationOTP( token) + "\n\nThe support Team";
    }

    public static String accountDebited(String name, String host, String token) {
        return "Hello " + name + ",\n\nYour new account has been created. Please click the link below to verify your account. \n\n" +
                getVerificationOTP( token) + "\n\nThe support Team";
    }

    public String generateAccountDebitedEmail(String recipientName, String amountDebited) {
        return "<div style=\"font-family: Helvetica, Arial, sans-serif; font-size: 16px; margin: 0; color: #0b0c0c;\">\n" +
                "<p>Hello " + recipientName + ",</p>\n" +
                "<p>We want to inform you that $" + amountDebited + " has been debited from your GoCash account.</p>\n" +
                "<p>If you have any concerns or questions about this transaction, please don't hesitate to contact our support team.</p>\n" +
                "<p>Best regards,</p>\n" +
                "<p>The GoCash Team</p>\n" +
                "</div>";
    }

    public String generateTransactionConfirmationEmailWithOTP(String recipientName, String transactionAmount, String transactionType, String otp) {
        return "<div style=\"font-family: Helvetica, Arial, sans-serif; font-size: 16px; margin: 0; color: #0b0c0c;\">\n" +
                "  <p>Hello " + recipientName + ",</p>\n" +
                "  <p>We are pleased to confirm the following transaction:</p>\n" +
                "  <ul>\n" +
                "    <li>Transaction Type: " + transactionType + "</li>\n" +
                "    <li>Transaction Amount: $" + transactionAmount + "</li>\n" +
                "  </ul>\n" +
                "  <p>To complete this transaction, please use the One-Time Password (OTP) provided below:</p>\n" +
                "  <p style=\"font-size: 24px; font-weight: bold;\">" + otp + "</p>\n" +
                "  <p>This OTP will expire in 10 minutes. Please do not share it with anyone for security reasons.</p>\n" +
                "  <p>If you did not initiate this transaction or need assistance, please contact our support team immediately.</p>\n" +
                "  <p>Thank you for using GoCash!</p>\n" +
                "  <p>Best regards,</p>\n" +
                "  <p>The GoCash Team</p>\n" +
                "</div>";
    }



    public static String getVerificationOTP(String token) {
        return "api/v1/GoCashController?token=" + token;
    }
}
