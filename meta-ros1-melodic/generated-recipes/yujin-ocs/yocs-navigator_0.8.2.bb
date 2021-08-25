# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Navigation module for robots"
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jihoon Lee"
HOMEPAGE = "http://wiki.ros.org/yocs_navigator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_navigator"

ROS_BUILD_DEPENDS = " \
    actionlib \
    move-base-msgs \
    nav-msgs \
    roscpp \
    rospy \
    tf \
    yocs-math-toolkit \
    yocs-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    move-base-msgs \
    nav-msgs \
    roscpp \
    rospy \
    tf \
    yocs-math-toolkit \
    yocs-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    move-base-msgs \
    nav-msgs \
    roscpp \
    rospy \
    tf \
    yocs-math-toolkit \
    yocs-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_navigator/0.8.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/yocs_navigator"
SRC_URI = "git://github.com/yujinrobot-release/yujin_ocs-release;${ROS_BRANCH};protocol=https"
SRCREV = "3eae0ef3741292d7758fe108e1ad944c15ab05bc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}